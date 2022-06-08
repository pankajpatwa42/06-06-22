package Assignment0606;

public class Q38Movie {
	private String title;
	private String studio;
	private String rating;
	
	public Q38Movie(String title,String studio,String rating)
	{
		this.title = title;
		this.rating=rating;
		this.studio = studio;
	}
	public Q38Movie(String title,String studio)
	{
		this.rating = "PG";
		this.title = title;
		this.studio = studio;
	}
	public Q38Movie[] getPg (Q38Movie[] mov)
	{
		Q38Movie[] pgMov = new Q38Movie[mov.length];
		int newArrayIndex = 0;
		for(int i =0;i<mov.length;i++)
		{
			if(mov[i].rating.equals("PG")) {
				pgMov[newArrayIndex]=mov[i];
				newArrayIndex++;
			}	
		}
		return pgMov;
	}
	
	public static void main(String args[])
	{
		
		}

		
		
	}		


