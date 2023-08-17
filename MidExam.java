

public class  MidExam{
public static void main(String[] args) {
    product B1 = new product();
    B1.name = "chair"; 
    B1.price = 500; 
    B1.getName();
    B1.getPrice();
    Electronics B2 = new Electronics(); 
    B2.name = "Television"; 
    B2.price = 20000.0; 
    B2.brand = "Samsung"; 
    B2.model = "Neo QLED"; 
    B2.getName();
    B2.getPrice();
    B2.getBrand();
    B2.getModel();
    Smartphone B3 = new Smartphone(); 
    B3.name = "Iphone";  
    B3.price = 40000.0; 
    B3.brand = "Apple";  
    B3.model = "Iphone 99"; 
    B3.operatingSystem = "ios";
    B3.getName(); 
    B3.getPrice(); 
    B3.getBrand(); 
    B3.getModel(); 
    B3.getOperatingSystem();
    Book B4 = new Book();
    B4.name ="OOP PROGRAMING"; 
    B4.price = 250.0; 
    B4.author = "John Doe"; 
    B4.pages = 300;
    B4.getName(); 
    
    B4.getPrice(); 
    B4.getAuthor(); 
    B4.getPages();
} 
}
class product {
    String name; 
    double price ;
    
    public  String getName(){
    System.out.println("Name:"+name);
    return name;    
    }
    public void setName(String name){ 
        this.name = name;
    }
    public double getPrice(){
        System.out.println("Price:"+price);
        return price;
    }
    public double setPrice(double price){
        return this.price  = price;
    } 
} 
class Electronics extends product{
    String brand; 
    String model; 
    
    public String getBrand(){
        System.out.println("Brand:"+brand);
        return brand; 
    }
    public void setBrand(String brand){
        this.brand = brand; 
    } 
    public String getModel(){
        System.out.println("Model:"+model);
        return model; 
    }
    public void setModel(String model){
        this.model = model;
    } 
}
class Smartphone extends Electronics {
    String operatingSystem; 

    public String getOperatingSystem(){
        System.out.println("OperatingSystem:"+operatingSystem);
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem){
        this.operatingSystem = operatingSystem;
    }
}
class Book extends product {
    String author; 
    int pages; 

    public String getAuthor(){
        System.out.println("Author:"+author);
        return author; 
    }
    public void setAuthor(String author){
        this.author = author; 
    }
    public int getPages(){
        System.out.println("Number of Pages:"+pages);
        return pages;
    }
    public int setPages(int pages){
        return this.pages = pages;
    } 
} 

