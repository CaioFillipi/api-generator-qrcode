![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)<br>
 <img src="https://img.shields.io/static/v1?label=spring boot&message=framework&color=blue&style=for-the-badge&logo=SPRING"/>
  <img src="https://img.shields.io/static/v1?label=Maven&message=>= 3.6&color=blue&style=for-the-badge&logo=APACHE"/>
  <img src="https://img.shields.io/static/v1?label=java&message=17&color=orange&style=for-the-badge&logo=JAVA"/>
  <img src="https://img.shields.io/static/v1?label=git&message=SCM&color=black&style=for-the-badge&logo=git"/>
<h1>API QRCode Generator</h1>
API desenvolvida para a geração de qrcodes.

<h2>Descrição do projeto</h2>
API para geração de QRCode recebe como parâmetros o tamanho(width,height) do QRCode e o valor(url a ser carregada para o QRCode) e gera um QRCode pronto para utilização.

<h2>Como rodar o projeto</h2>

Escolha um diretório e realize o clone do projeto com o comando
```
https://github.com/CaioFillipi/api-generator-qrcode.git
```

Após clonar o projeto, abra ele em sua IDE favorita (utilizei o Intellij), e aguarde o Maven realizar os downloads das dependências. Assim que finalizar, click com o botão direito na classe QrcodeGenerationApplication e selecione a opção Run 'QrcodeGenerati....main()', assim o projeto será iniciado.

O projeto está configurado para rodar na porta 8080. Caso precise alterar, basta ir no arquivo application.properties e colocar o comando
```
server.port = {PORTA_QUE_VOCE_DESEJA}
```
Para acessar o swagger da aplicação, basta colocar no campo de url do browser http://localhost:8080/swagger-ui.html#/.

<h2>Exemplo de execução</h2>

Dados da requisição:

![image](https://user-images.githubusercontent.com/19175715/226942053-74c94fae-12cc-43a9-a081-78dfc4894104.png)

Resposta da API:

![image](https://user-images.githubusercontent.com/19175715/226942304-85e00a51-04c2-474d-8f2d-9558bcbbe4ef.png)
