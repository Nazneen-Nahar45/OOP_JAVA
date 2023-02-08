import javax.swing.JOptionPane ;

	public class UapBazar {

		public static void main(String[] args) {
			Product[] pro = new Product[10] ;
			    String name , id , catagory ;

			    MainLoop:
			    while(true) {
			    String option = JOptionPane.showInputDialog("\n1 to add new product \n 2Update the price of a specific product \n 3View the discounted price of a specific product  \n4View the details of a specific product\n5 View the list of products with their details \n 0 to exit ");
			    switch(option) {
			    case "1" :
			    	
			    for(int i =0 ; i<pro.length ; i++) {
			    if(pro[i] == null) {
			    	name = JOptionPane.showInputDialog("please enter name\n ");
			    id = JOptionPane.showInputDialog("please enter id\n ");
			    catagory = JOptionPane.showInputDialog("Enter the catagory\n ") ;
			    String price = JOptionPane.showInputDialog("Please enter price\n");
				 double ba = Double.parseDouble(price) ;
				 Product UapBazar = new Product(name , id ,catagory ,  ba) ;
			    pro[i] = UapBazar ;
			    break ;
			    }

			}
			    break ;
			    case "2" :
			    String pro1 = JOptionPane.showInputDialog("Enter the id ") ;
			    for(int i=0 ; i<pro.length ; i++) {
			   
			    if(pro[i] == null ) break ;
			    if(pro[i].id.equals(pro1)) ;
			    String balance = JOptionPane.showInputDialog("enter the new price") ;
			    double  Debalance= Double.parseDouble(balance) ;
			    pro[i].updatePrice( Debalance);
			    break ;
			   
			   
			   
			    }
			    break ;
			   
			    case "3" :
			    String pro2 = JOptionPane.showInputDialog("enter the id");
			    for(int i=0 ; i<pro.length ; i++) {
			    if(pro[i]==null)
			    	break ;  
			    if(pro[i].id.equals(pro));
			    String balance  = JOptionPane.showInputDialog("enter discount");
			    double amm = Double.parseDouble(balance) ; 
			   pro[i].getDiscountedPrice(amm) ;
			   System.out.println("Discounted price: " + amm);
			   
			    }
			    break ;
			     
			    case "4" : 
			    	String pro3 = JOptionPane.showInputDialog("enter id");
				    for(int i=0 ; i<pro.length ; i++) {
				    if(pro[i]==null)
				    	break ;  
				    if(pro[i].id.equals(pro));
				    pro[i].display();
				    }
				    break ;
				    
			    	
			    	case "5" :
			    		for(int i=0 ; i<pro.length ; i++) {
	    					if(pro[i]==null) break ; 
	    					else
	    						pro[i].display();
			    		}
	    						
			   break ; 
			   
			    	case "0" :
			    		break MainLoop ; 
			    		
			}    
			    }
		}
	} 
		
		
