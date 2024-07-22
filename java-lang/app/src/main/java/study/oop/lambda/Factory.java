package study.oop.lambda;

import study.oop.lambda.Test04.InterestCalculator;

public class Factory {

  static InterestCalculator create(double rate) {

    return money -> money + (money * rate);
  }
}
