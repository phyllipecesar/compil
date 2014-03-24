/*
 * Mostrando um pouco da declaracao de variaveis
 * 1) Podem ser declaradas globais
 * 2) Usadas dentro de funcoes
 * 3) Nao existir parametro com mesmo nome
 */


void escopoVariavel( ) {
  int a = 4;
  string b = 6;
  bool c = false;
  a = c;
  return a;
}
// int naoExistente;
int notaBoa(int nota, int teste = 1) {
  // variavel existe
  int teste;
  
  // Descomente a variavel em cima, para ele fazer
  // o lookUp global
  return naoExistente;
}
 
 
