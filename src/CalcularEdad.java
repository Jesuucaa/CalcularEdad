
public class CalcularEdad {
	
	public static int calcularEdad(int añoNacimiento, int mesNacimiento, int diaNacimiento)
	{
		int edad;
		int añoActual = 2022;
		int mesActual = 9;
		
		//En este programa tomaremos en cuenta que el día actual es 22 de septiembre de 2022
		int diaActual = 22;
		
		edad = añoActual - añoNacimiento;
		String mensajeError = "ERROR, este mes solo tiene ";
		
		int opcion = mesNacimiento;
		switch(opcion)
		{
			case 1:
				if(diaNacimiento >= 1 && diaNacimiento <= 31)
				{
					edad = añoActual - añoNacimiento;
				}
				else
				{
					System.out.println(mensajeError+"31 dias");
					edad = 0;
				}
				break;
				
			case 2:
				//28
				if(diaNacimiento >= 1 && diaNacimiento <= 28)
				{
					edad = añoActual - añoNacimiento;
				}
				else
				{
					System.out.println(mensajeError+"28 dias");
					edad = 0;
				}
				break;
				
			case 3:
				//31
				if(diaNacimiento >= 1 && diaNacimiento <= 31)
				{
					edad = añoActual - añoNacimiento;
				}
				else
				{
					System.out.println(mensajeError+"31 dias");
					edad = 0;
				}
				break;
				
			case 4:
				//30
				if(diaNacimiento >= 1 && diaNacimiento <= 30)
				{
					edad = añoActual - añoNacimiento;
				}
				else
				{
					System.out.println(mensajeError+"30 dias");
					edad = 0;
				}
				break;
				
			case 5:
				//31
				if(diaNacimiento >= 1 && diaNacimiento <= 31)
				{
					edad = añoActual - añoNacimiento;
				}
				else
				{
					System.out.println(mensajeError+"31 dias");
					edad = 0;
				}
				break;
				
			case 6:
				//30
				if(diaNacimiento >= 1 && diaNacimiento <= 31)
				{
					edad = añoActual - añoNacimiento;
				}
				else
				{
					System.out.println(mensajeError+"31 dias");
					edad = 0;
				}
				break;
				
			case 7:
				//31
				if(diaNacimiento >= 1 && diaNacimiento <= 31)
				{
					edad = añoActual - añoNacimiento;
				}
				else
				{
					System.out.println(mensajeError+"31 dias");
					edad = 0;
				}
				break;
				
			case 8:
				if(diaNacimiento >= 1 && diaNacimiento <= 31)
				{
					edad = añoActual - añoNacimiento;
				}
				else
				{
					System.out.println(mensajeError+"31 dias");
					edad = 0;
				}
				break;
				
			case 9:
				//30
				if(diaNacimiento >= 1 && diaNacimiento <= 30)
				{
					if(diaNacimiento <= 22)
					{
						edad = añoActual - añoNacimiento;
					}
					else
					{
						edad = añoActual - añoNacimiento;
						edad--;
					}
				}
				else
				{
					System.out.println(mensajeError+"30 dias");
					edad = 0;
				}
				break;
				
			case 10:
				//31
				if(diaNacimiento >= 1 && diaNacimiento <= 31)
				{
					edad = añoActual - añoNacimiento;
					edad--;
				} else {
					System.out.println(mensajeError+"31 dias");
					edad = 0;
				}
				break;
				
			case 11:
				//30
				if(diaNacimiento >= 1 && diaNacimiento <= 30)
				{
					edad = añoActual - añoNacimiento;
					edad--;
				}
				else
				{
					System.out.println(mensajeError+"30 dias");
					edad = 0;
				}
				break;
				
			case 12:
				//31
				if(diaNacimiento >= 1 && diaNacimiento <= 31)
				{
					edad = añoActual - añoNacimiento;
					edad--;
				}
				else
				{
					System.out.println(mensajeError+"31 dias");
					edad = 0;
				}
				break;
		}
		
		
		
		return edad;
	}
}
