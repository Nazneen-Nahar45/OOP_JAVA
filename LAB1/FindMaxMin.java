public class FindMaxMin {
 public static void main(String[] args) {
  int a = 6 , b = 9 , c = 4 ;
  if(a>b && b>c) 
 { System.out.println(a) ;
} 
 else if (b>a && b>c)
 { System.out.println(b) ;
} 
 else { System.out.println(c) ; }
if (a<b && b<c)
 { System.out.println(a) ;
} 
 else if (b<a &&  b<c) 
{ System.out.println(b) ;
} 
else 
{ System.out.println(c) ;
 } 
}
}