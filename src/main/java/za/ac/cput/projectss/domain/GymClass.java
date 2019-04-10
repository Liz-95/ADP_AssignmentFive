package za.ac.cput.projectss.domain;

public class GymClass {

    private String gymId, gymClassName;

    private GymClass(){

    }

    private GymClass(Builder builder){
        this.gymId= builder.gymId;
        this.gymClassName= builder.gymClassName;
    }

    public String getGymId(){
        return gymId;
    }

    public String getGymClassName(){
        return gymClassName;
    }

    public static class Builder{
        private String gymId, gymClassName;

        public Builder gymId(String gymId){
            this.gymId= gymId;
            return this;
        }
        public Builder gymClassName(String gymClassName){
            this.gymClassName= gymClassName;
            return this;
        }

        public GymClass build(){
            return new GymClass(this);
        }
    }


}
