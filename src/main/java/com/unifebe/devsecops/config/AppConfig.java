package com.unifebe.devsecops.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Credenciais carregadas do arquivo .env (nao versionado) ou das
 * variaveis de ambiente do sistema.
 *
 * O spring-dotenv injeta o conteudo do .env no Environment do Spring,
 * permitindo o uso de @Value normalmente.
 *
 * O ":" apos ${...} define um valor vazio como padrao, evitando que a
 * aplicacao quebre caso a variavel nao esteja definida.
 */
@Component
public class AppConfig {

    @Value("${DB_PASSWORD:}")
    private String dbPassword;

    @Value("${AWS_ACCESS_KEY_ID:}")
    private String awsAccessKeyId;

    @Value("${AWS_SECRET_ACCESS_KEY:}")
    private String awsSecretAccessKey;

    @Value("${PAYMENT_GATEWAY_API_KEY:}")
    private String paymentGatewayApiKey;

    public String getDbPassword() {
        return dbPassword;
    }

    public String getAwsAccessKeyId() {
        return awsAccessKeyId;
    }

    public String getAwsSecretAccessKey() {
        return awsSecretAccessKey;
    }

    public String getPaymentGatewayApiKey() {
        return paymentGatewayApiKey;
    }

}
