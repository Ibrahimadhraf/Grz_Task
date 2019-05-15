package com.example.android.grz_task;

import java.util.List;

public class MainView {
    public List<SliderInfo> sliders;
    public List<CategoryInfo> category;
    public List<ProductRateInfo> productsbyrate;


    public List<SliderInfo> getSliders() {
        return sliders;
    }

    public void setSliders(List<SliderInfo> sliders) {
        this.sliders = sliders;
    }

    public List<CategoryInfo> getCategory() {
        return category;
    }

    public void setCategory(List<CategoryInfo> category) {
        this.category = category;
    }


    public void setProductsbyrate(List<ProductRateInfo> productsbyrate) {
        this.productsbyrate = productsbyrate;
    }

    public List<ProductRateInfo> getProductsbyrate() {
        return productsbyrate;
    }

    public static class SliderInfo {
        // "photo":"http:\/\/shopgate.codesroots.com\/library\/attachment\/1545749814.jpg"
        String photo;

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }
    }

    public static class CategoryInfo {
  /*  "id": 22,
            "name": "منتجات البشرة والجلد",
            "name_en": "Skin Products",
            "created": "2019-05-01T16:59:38+0000",
            "photo": "http://shopgate.codesroots.com/library/attachment/1556744378990961308.jpg",
            "modified": "2019-05-01T16:59:38+0000",*/
        int id;
        String name;
        String name_en;
        String photo;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName_en() {
            return name_en;
        }

        public void setName_en(String name_en) {
            this.name_en = name_en;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }
    }

    public static class ProductRateInfo {
        /* "productsbyrate":[
            {
                "total_result":4,
                    "id":126,
                    "start_price":15,
                    "product_id":18,
                    "size":"1",
                    "current_price":15,
               "amount":20,
                    */
        private int id;
        private int start_price;
        private int product_id;
        private String size;
        private int current_price;
        private int amount;
        private List<OrderDetails> orderdetails;
        private Product product;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getStart_price() {
            return start_price;
        }

        public void setStart_price(int start_price) {
            this.start_price = start_price;
        }

        public int getProduct_id() {
            return product_id;
        }

        public void setProduct_id(int product_id) {
            this.product_id = product_id;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public int getCurrent_price() {
            return current_price;
        }

        public void setCurrent_price(int current_price) {
            this.current_price = current_price;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public List<OrderDetails> getOrderdetails() {
            return orderdetails;
        }

        public void setOrderdetails(List<OrderDetails> orderdetails) {
            this.orderdetails = orderdetails;
        }

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }
    }
    public static class OrderDetails{
           /* "productsize_id":126,
                    "order_id":567,
                    "count":4 */
           private  int productsize_id;
           private int order_id;
           private int count;

        public int getProductsize_id() {
            return productsize_id;
        }

        public void setProductsize_id(int productsize_id) {
            this.productsize_id = productsize_id;
        }

        public int getOrder_id() {
            return order_id;
        }

        public void setOrder_id(int order_id) {
            this.order_id = order_id;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }
    public static  class Product{
    /*
    "id":18,
            "name":"iwhite2",
            "name_en":"iwhite2",
            "cat_id":25,
            "subcat_id":0,
            "created":"2019-05-01T17:35:53+0000",
            "modified":"2019-05-01T17:35:53+0000",
            "description":"\u0645\u0646\u062a\u062c \u062a\u0628\u064a\u064a\u0636 \u0627\u0644\u0623\u0633\u0646\u0627\u0646",
            "description_en":"iwhite2",
            "red":"0",
            "green":"0",
            "blue":"0",
            "visible":"1",
     */
    private  int id ;
    private String name;
    private String name_en;
    private String description;
    private String description_en;
    private List<TotalRating>total_rating;
    private List<Product_Photos>productphotos;
    private List<poductSizes>productsizes;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName_en() {
            return name_en;
        }

        public void setName_en(String name_en) {
            this.name_en = name_en;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDescription_en() {
            return description_en;
        }

        public void setDescription_en(String description_en) {
            this.description_en = description_en;
        }

        public List<TotalRating> getTotal_rating() {
            return total_rating;
        }

        public void setTotal_rating(List<TotalRating> total_rating) {
            this.total_rating = total_rating;
        }

        public List<Product_Photos> getProductphotos() {
            return productphotos;
        }

        public void setProduct_photos(List<Product_Photos> productphotos) {
            this.productphotos = productphotos;
        }

        public List<poductSizes> getProductsizes() {
            return productsizes;
        }

        public void setProductsizes(List<poductSizes> productsizes) {
            this.productsizes = productsizes;
        }
    }
    public static class TotalRating{
    /*
    total_rating": [
                    {
                        "product_id": 24,
                        "stars": 4,
                        "count": 1
                    }
     */
      int product_id;
      int stars;
      int count;

        public int getProduct_id() {
            return product_id;
        }

        public void setProduct_id(int product_id) {
            this.product_id = product_id;
        }

        public int getStars() {
            return stars;
        }

        public void setStars(int stars) {
            this.stars = stars;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }
    public static class Product_Photos {
         /*
            "productphotos":[
               {
                  "product_id":18,
                  "id":59,
                  "photo":"http:\/\/shopgate.codesroots.com\/library\/attachment\/15567465531278776543.jpg"
               }
            ],
          */
         private int product_id;
         private int id;
         private String photo;

        public int getProduct_id() {
            return product_id;
        }

        public void setProduct_id(int product_id) {
            this.product_id = product_id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }
    }
    public static class poductSizes{
 /*"id":132,
         "product_id":24,
         "size":"114g",
         "created":"2019-05-01T17:48:33+0000",
         "modified":"2019-05-01T17:48:33+0000",
         "current_price":7,
         "start_price":7,
         "amount":5*/
 private  int id;
 private  int product_id;
  private String size;
  private String current_price;
  private String start_price;
  private String amount;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getProduct_id() {
            return product_id;
        }

        public void setProduct_id(int product_id) {
            this.product_id = product_id;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getCurrent_price() {
            return current_price;
        }

        public void setCurrent_price(String current_price) {
            this.current_price = current_price;
        }

        public String getStart_price() {
            return start_price;
        }

        public void setStart_price(String start_price) {
            this.start_price = start_price;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }
    }
}
