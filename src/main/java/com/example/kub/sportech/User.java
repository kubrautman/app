package com.example.kub.sportech;


    public class User {

        public String id;
       public String email;
        public String name;
        public String gender;
       public String photo;
       public  String age;
       public  String password;

        public User(){

        }



        public User(String id,String password, String email, String name, String gender, String photo ){//,String age) {
            this.id = id;
            this.email = email;
            this.name = name;
            this.gender = gender;
            this.photo = photo;
           // this.age = age;
        }

        public User( String email,String password,String name, String gender, String photo) {//, String age
            this.id = null;

            this.email = email;
            this.password=password;
            this.name = name;
            this.gender = gender;
            this.photo = photo;
            //this.age = age;
        }

    }







