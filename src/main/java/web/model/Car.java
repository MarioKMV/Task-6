package web.model;


    public class Car {

        private String model;
        private String color;
        private int age;

        public Car() {
        }

        public Car(String model, String color, int age) {
            this.model = model;
            this.color = color;
            this.age = age;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
