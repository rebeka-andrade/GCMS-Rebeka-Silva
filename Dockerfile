# Usando imagem leve do Debian como base 
FROM debian:bookworm-slim 
# Atualizando a base de pacotes de software 
RUN apt update 
# Instalando Gradle e OpenJDK (-y força a instalação sem perguntar) 
RUN apt install -y gradle openjdk-17-jdk 
# Copiando a pasta do projeto (./) para uma pasta App dentro da imagem 
COPY ./ /App/ 
# Mudando o diretório de trabalho para o diretório do App 
WORKDIR /App/ 
# Dando permissão de execução e compilando com o Gradlew. 
RUN chmod 755 gradlew && ./gradlew assemble --console=plain 
# Rodando os testes. Rodado ao executar docker start. 
CMD ["./gradlew", "check"]