package com.example.myfirstandroidcalculator;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

public class Calc implements Parcelable {
    private String buttonOne;
    private String buttonTwo;
    private String buttonThree;
    private String buttonFour;
    private String buttonFive;
    private String buttonSix;
    private String buttonSeven;
    private String buttonEight;
    private String buttonNine;
    private String buttonZero;
    private String buttonDot;
    private boolean isNumberFirst;
    private boolean isNumberSecond;
    private double numberFirst;
    private double numberSecond;

    public Calc() {
        buttonOne = String.valueOf(1);
        buttonTwo = String.valueOf(2);
        buttonThree = String.valueOf(3);
        buttonFour = String.valueOf(4);
        buttonFive = String.valueOf(5);
        buttonSix = String.valueOf(6);
        buttonSeven = String.valueOf(7);
        buttonEight = String.valueOf(8);
        buttonNine = String.valueOf(9);
        buttonZero = "0";
        buttonDot = String.valueOf('.');
        isNumberFirst = false;
        isNumberSecond = false;
//        numberFirst = 0;
//        numberSecond = 0;
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    protected Calc(Parcel in) {
        buttonOne = in.readString();
        buttonTwo = in.readString();
        buttonThree = in.readString();
        buttonFour = in.readString();
        buttonFive = in.readString();
        buttonSix = in.readString();
        buttonSeven = in.readString();
        buttonEight = in.readString();
        buttonNine = in.readString();
        buttonZero = in.readString();
        buttonDot = in.readString();
        numberFirst = in.readDouble();
        numberSecond = in.readDouble();
        isNumberFirst = in.readBoolean();
        isNumberSecond = in.readBoolean();
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(buttonOne);
        dest.writeString(buttonTwo);
        dest.writeString(buttonThree);
        dest.writeString(buttonFour);
        dest.writeString(buttonFive);
        dest.writeString(buttonSix);
        dest.writeString(buttonSeven);
        dest.writeString(buttonEight);
        dest.writeString(buttonNine);
        dest.writeString(buttonZero);
        dest.writeString(buttonDot);
        dest.writeDouble(numberFirst);
        dest.writeDouble(numberSecond);
        dest.writeBoolean(isNumberFirst);
        dest.writeBoolean(isNumberSecond);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Calc> CREATOR = new Creator<Calc>() {
        @Override
        public Calc createFromParcel(Parcel in) {
            return new Calc(in);
        }

        @Override
        public Calc[] newArray(int size) {
            return new Calc[size];
        }
    };

    public String getButtonOne() {
        return buttonOne;
    }

    public String getButtonTwo() {
        return buttonTwo;
    }

    public String getButtonThree() {
        return buttonThree;
    }

    public String getButtonFour() {
        return buttonFour;
    }

    public String getButtonFive() {
        return buttonFive;
    }

    public String getButtonSix() {
        return buttonSix;
    }

    public String getButtonSeven() {
        return buttonSeven;
    }

    public String getButtonEight() {
        return buttonEight;
    }

    public String getButtonNine() {
        return buttonNine;
    }

    public String getButtonZero() {
        return buttonZero;
    }

    public String getButtonDot() {
        return buttonDot;
    }

    public double getNumberFirst() {
        return numberFirst;
    }

    public double getNumberSecond() {
        return numberSecond;
    }

    public boolean isNumberFirst() {
        return isNumberFirst;
    }

    public boolean isNumberSecond() {
        return isNumberSecond;
    }
    public void setIsNumberFirst(Boolean bool) {
        isNumberFirst = bool;
    }
    public void setIsNumberSecond(Boolean bool) {
        isNumberSecond = bool;
    }

    public void setNumberFirst(TextView calcScreen) {
        numberFirst = Double.parseDouble(String.valueOf(calcScreen.getText()));
    }

    public void setNumberSecond(TextView calcScreen) {
        numberSecond = Double.parseDouble(String.valueOf(calcScreen.getText()));
    }
}
