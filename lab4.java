

public class lab4 
{
	public static String[] name ={"������", "�������", "����", "������", "���", "����"," ����", "������", "��������", "�������", "������", "�������"};//������ �������
	public static String[] sezon={"����", "�����","����","�����"};//������ ������� ����
	public static int[] kol_day={31,28,31,30,31,30,31,31,30,31,30,31};//������������� ������� �������(���-�� ����)
	
//����� main
	public static void main(String[] args)
	{
		if(kol_day[1]==28)
		{
			System.out.println("  ��� �� ����������");
		}
		else
		{
			System.out.println("  ��� ����������");
		}
		show();//���������� ������ 
		int i=0;//�������� �������
		double sum = 0;//������� ���-�� ���� � ������
		while(i<12)
		{
			sum=sum+kol_day[i];
			i++;
		}
		sum=sum/i;//����� ����� ���� �� 12
		System.out.println(sum+ " ������� ���-�� ���� � ������ � ����");

	}
	private static void show()//������� �� ������� ������
	{
		for(int i=0;i<4;i++)
		{
			switch(sezon[i])//������ ������ � �������
			{
			
			case "����":
				
				System.out.println(name[0]+" ��� "+sezon[i]+" � �������� "+kol_day[0]+ " ����");
				System.out.println(name[11]+" ��� "+sezon[i]+" � �������� "+kol_day[11]+ " ����");
				System.out.println(name[1]+" ��� "+sezon[i]+" � �������� "+kol_day[1]+ " ����");
				break;
			case "�����" :
				System.out.println(name[2]+" ��� "+sezon[i]+" � �������� "+kol_day[2]+ " ����");
				System.out.println(name[3]+" ��� "+sezon[i]+" � �������� "+kol_day[3]+ " ����");
				System.out.println(name[4]+" ��� "+sezon[i]+" � �������� "+kol_day[4]+ " ����");
				break;
			case "����":
				System.out.println(name[5]+" ��� "+sezon[i]+" � �������� "+kol_day[5]+ " ����");
				System.out.println(name[6]+" ��� "+sezon[i]+" � �������� "+kol_day[6]+ " ����");
				System.out.println(name[7]+" ��� "+sezon[i]+" � �������� "+kol_day[7]+ " ����");
				break;
			case "�����":
				System.out.println(name[8]+" ��� "+sezon[i]+" � �������� "+kol_day[8]+ " ����");
				System.out.println(name[9]+" ��� "+sezon[i]+" � �������� "+kol_day[9]+ " ����");
				System.out.println(name[10]+" ��� "+sezon[i]+" � �������� "+kol_day[10]+ " ����");
			break;
			}			
		}
	}
}


