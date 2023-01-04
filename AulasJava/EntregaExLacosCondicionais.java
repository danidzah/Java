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


