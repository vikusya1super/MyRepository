

public class lab4 
{
	public static String[] name ={"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь"," Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};//массив месяцев
	public static String[] sezon={"Зима", "Весна","Лето","Осень"};//массив сезонов года
	public static int[] kol_day={31,28,31,30,31,30,31,31,30,31,30,31};//соответствует массиву месяцев(кол-во дней)
	
//метод main
	public static void main(String[] args)
	{
		if(kol_day[1]==28)
		{
			System.out.println("  Год не высокосный");
		}
		else
		{
			System.out.println("  Год высокосный");
		}
		show();//показывает строки 
		int i=0;//итератор месяцев
		double sum = 0;//среднее кол-во дней в месяце
		while(i<12)
		{
			sum=sum+kol_day[i];
			i++;
		}
		sum=sum/i;//делим сумму дней на 12
		System.out.println(sum+ " среднее кол-во дней в месяце в году");

	}
	private static void show()//Выводит на консоль строки
	{
		for(int i=0;i<4;i++)
		{
			switch(sezon[i])//индекс месяца в массиве
			{
			
			case "Зима":
				
				System.out.println(name[0]+" это "+sezon[i]+" и содержит "+kol_day[0]+ " дней");
				System.out.println(name[11]+" это "+sezon[i]+" и содержит "+kol_day[11]+ " дней");
				System.out.println(name[1]+" это "+sezon[i]+" и содержит "+kol_day[1]+ " дней");
				break;
			case "Весна" :
				System.out.println(name[2]+" это "+sezon[i]+" и содержит "+kol_day[2]+ " дней");
				System.out.println(name[3]+" это "+sezon[i]+" и содержит "+kol_day[3]+ " дней");
				System.out.println(name[4]+" это "+sezon[i]+" и содержит "+kol_day[4]+ " дней");
				break;
			case "Лето":
				System.out.println(name[5]+" это "+sezon[i]+" и содержит "+kol_day[5]+ " дней");
				System.out.println(name[6]+" это "+sezon[i]+" и содержит "+kol_day[6]+ " дней");
				System.out.println(name[7]+" это "+sezon[i]+" и содержит "+kol_day[7]+ " дней");
				break;
			case "Осень":
				System.out.println(name[8]+" это "+sezon[i]+" и содержит "+kol_day[8]+ " дней");
				System.out.println(name[9]+" это "+sezon[i]+" и содержит "+kol_day[9]+ " дней");
				System.out.println(name[10]+" это "+sezon[i]+" и содержит "+kol_day[10]+ " дней");
			break;
			}			
		}
	}
}


