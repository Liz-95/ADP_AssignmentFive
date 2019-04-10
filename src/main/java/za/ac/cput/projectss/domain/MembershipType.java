package za.ac.cput.projectss.domain;

import java.util.Set;


public class MembershipType {

    private String memberId,memberlName, memberfName, membershipTypethree;
    private int age;
    private Set<GymClass> classes;

    private MembershipType(){

    }
    private MembershipType(Builder builder){
        this.memberId= builder.memberId;
        this.memberlName=builder.memberlName;
        this.memberfName=builder.memberfName;
        this.membershipTypethree=builder.membershipTypeThree;
        this.age=builder.age;

    }

    public String getMemberId(){
        return memberId;
    }
    public String getMemberlName(){
        return memberlName;
    }

    public String getMemberfName(){
        return memberfName;
    }

    public String getMembershipTypethree(){
        return membershipTypethree;
    }

    public int getAge(){
        return age;
    }
    public static class Builder {
        private String memberId, memberlName, memberfName, membershipTypeThree;
        private int age;
        private Set<GymClass> classes;

        public Builder memberId(String memberId) {
            this.memberId = memberId;
            return this;
        }

        public Builder memberlName(String memberlName) {
            this.memberlName = memberlName;
            return this;

        }

        public Builder memberfName(String memberfName) {
            this.memberfName = memberfName;
            return this;
        }

        public Builder membershipTypeThree(String membershipTypeThree) {
            this.membershipTypeThree = membershipTypeThree;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public MembershipType tone() {
            return new MembershipType(this);
        }


    }
}




