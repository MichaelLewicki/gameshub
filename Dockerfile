FROM ghcr.io/graalvm/graalvm-ce:ol7-java17-22.3.3
WORKDIR /work/
COPY target/*-runner /work/application

#si no funciona, cambiar COPY después de RUN
RUN chown 1001 /work \
    && chmod "g+rwX" /work \
    && chown 1001:root /work

EXPOSE 8080
USER 1001

CMD ["./application", "-Dquarkus.http.host=0.0.0.0"]
