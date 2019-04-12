package com.gmail.chernii.oleksii.builder;

import com.gmail.chernii.oleksii.factory.method.Car;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Space on 12.04.2019.
 */
@AllArgsConstructor
@Getter
@Setter
public class CarBuilder implements Car {
    private int speed;
    private String name;

    public static Builder newInstance() {
        return new Builder();
    }

    @Override
    public void showInfo() {
        System.out.println(name + " " + speed);
        System.out.println(getClass().getSimpleName());
    }

    public static class Builder {
        private int speed;
        private String name;

        private Builder() {
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder build() {
            return new CarBuilder(speed, name);
        }
    }
}
