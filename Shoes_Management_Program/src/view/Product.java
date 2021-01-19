package view;

import java.util.Date;

class Product {
   private String p_code;
   private String kind;
   private String p_name;
   private int price;
   private int p_size;
   
   public Product() {}

   public Product(String p_code, String kind, String p_name, int price, int p_size) {
      
      this.p_code = p_code;
      this.kind = kind;
      this.p_name = p_name;
      this.price = price;
      this.p_size = p_size;
   }

   public String getP_code() {
      return p_code;
   }

   public String getKind() {
      return kind;
   }

   public String getP_name() {
      return p_name;
   }

   public int getPrice() {
      return price;
   }

   public int getP_size() {
      return p_size;
   }

   public void setP_code(String p_code) {
      this.p_code = p_code;
   }

   public void setKind(String kind) {
      this.kind = kind;
   }

   public void setP_name(String p_name) {
      this.p_name = p_name;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public void setP_size(int p_size) {
      this.p_size = p_size;
   }
}//end product 
 
 class Input{ //인풋은 total price 필요없음(있으면 더 헷갈림) 필요에따라 출력시 소비자가 상품정보볼때 단품으로보니까 조인해서 product테이블에서 가격가져오고
             // 상품 등록자는 그냥 재고 수량만 보면 되니까 
    private String p_code;
    private String kind;
    private Date i_date;
    private int quantity;
    
    public Input() {}

   public Input(String p_code, String kind, Date i_date, int quantity) {
      this.p_code = p_code;
      this.kind = kind;
      this.i_date = i_date;
      this.quantity = quantity;
   }
    public Input(String p_code, Date i_date, int quantity) {
         this.p_code = p_code;
         this.i_date = i_date;
         this.quantity = quantity;
      }

   public String getP_code() {
      return p_code;
   }

   public String getKind() {
      return kind;
   }

   public Date getI_date() {
      return i_date;
   }

   public int getQuantity() {
      return quantity;
   }

   public void setP_code(String p_code) {
      this.p_code = p_code;
   }

   public void setKind(String kind) {
      this.kind = kind;
   }

   public void setI_date(Date i_date) {
      this.i_date = i_date;
   }

   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }
    
    
 }//end input
 
 class Output{
    private String p_code;
    private String kind;
    private Date o_date;
    private int quantity;
    private int totalPrice; // db에도 만들기
    public Output() {}
     
    public Output(String p_code, String kind, Date o_date, int quantity, int totalPrice) {
         this.p_code = p_code;
         this.kind = kind;
         this.o_date = o_date;
         this.quantity = quantity;
         this.totalPrice = totalPrice;
    }

   public String getP_code() {
      return p_code;
   }

   public String getKind() {
      return kind;
   }

   public Date getO_date() {
      return o_date;
   }

   public int getQuantity() {
      return quantity;
   }

   public void setP_code(String p_code) {
      this.p_code = p_code;
   }

   public void setKind(String kind) {
      this.kind = kind;
   }

   public void setO_date(Date o_date) {
      this.o_date = o_date;
   }

   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }
    public int getTotalPrice() {
         return totalPrice;
      }

      public void setTotalPrice(int totalPrice) {
         this.totalPrice = totalPrice;
      }  

 }//end output 
       
 
       
 