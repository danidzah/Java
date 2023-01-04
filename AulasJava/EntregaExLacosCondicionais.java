package AulaLacosCondicionais;

public class EntregaExLacosCondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpacote  AulaLacosCondicionais ;

importar  java . . _ Scanner ;

public  class  Exercícios3 {

	public  static  void  principal ( String [] args ) {
		Scanner  leia = novo  Scanner ( System . in );
		int  idade ;
		Sistema . fora . println ( "\nDiga sua idade: " );
		idade = leia . proximoInt ();
		
		if ( idade >= 16 && idade <= 18 )
		{
			Sistema . fora . println ( "\nApta a votar e o voto é facultativo!" );
		}
		else  if ( idade >= 18 && idade < 65 )
		{
			Sistema . fora . println ( "\nApta a votar e o voto é obrigatório!" );
		}
		else  if ( idade >= 65 )
		{
			Sistema . fora . println ( "\nApta a votar e o voto é facultativo!" );	
		}
		outro
		{
			Sistema . fora . println ( "\nA pessoa não está apta a votar!!!" );
		}
			
	}

}

//---------------------------------------------------------------------------------
		public  class  Exercício1 {

	public  static  void  principal ( String [] args ) {
		Scanner  leia = novo  Scanner ( System . in );
		 número int ;
		
		Sistema . fora . println ( "\nDigite um número: " );
		numero = leia . proximoInt ();

		if ( numero % 2 == 0 && numero > 0 )
		{
			Sistema . fora . println ( "\nNumero positivo e par" );
		}

		else  if ( numero % 2 == 1 )
		{
			Sistema . fora . println ( "\nNúmero positivo e impar" );
		}
	
		if (( numero % 2 == 0 ) && ( numero < 0 ))
		{
			Sistema . fora . println ( "\nNumero negativo e par" );
		}
		else  if (( numero % 2 == - 1 ) && ( numero < 0 ))
		{
			Sistema . fora . println ( "\nNúmero negativo e plural" );

		}

}
	
}
