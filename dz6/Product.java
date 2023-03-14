package dz6;

public class Product {

            private String name;
            private int code;
            private double price;
            private String description;
            private boolean available;

            public Product(String name, int code, double price, String description, boolean available) {
                this.name = name;
                this.code = code;
                this.price = price;
                this.description = description;
                this.available = available;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getCode() {
                return code;
            }

            public void setCode(int code) {
                this.code = code;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public boolean getAvailable() {
                return available;
            }

            public void setAvailable(boolean available) {
                this.available = available;
            }
        }

