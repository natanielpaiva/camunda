
Iniciar o processo do Camunda


curl --location --silent --output --request POST 'http://localhost:8080/engine-rest/process-definition/key/meu-projeto-process/start' --header 'Content-Type: application/json' --data-raw '{
"variables": {
"cep": {
"value": "72873519",
"type": "String"
}
}
}'