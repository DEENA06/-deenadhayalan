    class Simple{
    public static void main(String args[])
     
    {
     
            int array[] = {2,2,2,1,5,4,6,8};
            int size = array.length;
            int max=0;
            System.out.println("Size before deletion: " + size);
 
            for (int i=0;i<size;i++) 
            {
 
                for (int j=i+1;j<size;j++) 
                {
 
 
                    if (array[i]==array[j]) 
                    {
                      max=array[i];
                    }
                      }
                     }
System.out.println(max);
}
}