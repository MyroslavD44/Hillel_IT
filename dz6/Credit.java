package dz6;

public class Credit {

            private String creditorName;
            private double sum;
            private double interestRate;
            private int termInMonths;

            public Credit(String borrowerName, double principal, double interestRate, int termInMonths) {
                this.creditorName = creditorName;
                this.sum = sum;
                this.interestRate = interestRate;
                this.termInMonths = termInMonths;
            }

            public String getCreditorName() {
                return creditorName;
            }

            public double getSum() {
                return sum;
            }

            public double getInterestRate() {
                return interestRate;
            }

            public int getTermInMonths() {
                return termInMonths;
            }

            public double calculateTotalAmount() {
                double monthlyRate = interestRate / 1200;
                double monthlyPayment = (sum * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -termInMonths));
                return monthlyPayment * termInMonths;
            }

            public double calculateMonthlyPayment() {
                double monthlyRate = interestRate / 1200;
                return (sum * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -termInMonths));
            }
        }

