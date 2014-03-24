/*
 * Esse codigo mostra ALGUMAS
 * funcionalidades da semantica de funcao
 */ 
 
funcaoNaoDeclarada(1);
funcao(1);
// Uma funcao que existe pode ser chamada 
int funcao(int a) {
  funcao(true);
  return notaFranklin( );
}


int notaFranklin( ) {
  // Coloque entre "" e veja que acontece um erro
  return 10;
}

string funcaoRetorna(string a = "valor") {
  // Tipo errado, retornando inteiro quando deveria ser string
  return notaFranklin( );
}

// Parametros com mesmo nome
int wrongParameters(int a, int a) {
  
}
