package Date21_9;

public class matrixidentity {



	   public static void main(String[] args) {
	        int [][] a= {{1,0,0},{0,1,0},{0,0,1}};
	        
	        int i,j,e=0,o=0;
	        for(i = 0; i < 3 ; i++)
	        {
	            
	            for(j = 0; j < 3; j++)
	            {
	                if(i==j)
	                {
	                    if(a[i][j]!=1)
	                    {
	                        System.out.println("not identity matrix");
	                        System.exit(0);
	                    }
	                }
	                else {
	                    if(a[i][j]!=0)
	                    {
	                        System.out.println("not identity matrix");
	                        System.exit(0);
	                    }
	                }
	            }
	        }
	        System.out.print("identity matrix");
	        



	   }



	}