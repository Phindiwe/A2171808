package com.fivehl.tp2.Model;

public class CreditCard {
    private String cardNumber,expiredDate,nameOnCard;

    public String getCardNumber() {
        return cardNumber;
    }
    public String getNameOnCard() {
        return nameOnCard;
    }
    public String getExpiredDate() {
        return expiredDate;
    }

    private CreditCard(CreditCard.Builder builder) {
        this.cardNumber = builder.cardNumber;
        this.nameOnCard = builder.nameOnCard;
        this.expiredDate = builder.expiredDate;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", expiredDate='" + expiredDate + '\'' +
                ", nameOnCard='" + nameOnCard + '\'' +
                '}';
    }


    public static class Builder {

        private String cardNumber;
        private String expiredDate;
        private String nameOnCard;


        public CreditCard.Builder setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public CreditCard.Builder setExpiredDate(String expiredDate) {
            this.expiredDate = expiredDate;
            return this;
        }
        public CreditCard.Builder setNameOnCard(String nameOnCard) {
            this.nameOnCard = nameOnCard;
            return this;
        }


        public CreditCard build() {
            return new CreditCard(this);
        }

        public CreditCard.Builder copy(CreditCard creditCard) {
            this.cardNumber = creditCard.cardNumber;
            this.expiredDate= creditCard.nameOnCard;
            this.expiredDate = creditCard.expiredDate;
            return this;
        }
    }

}
