public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();

        config.setServerUrl("http://miapi.com");
        System.out.println("URL del Servidor: " + config.getServerUrl());

        config.setPort(8080);
        System.out.println("Puerto: " + config.getPort());
    }
}
