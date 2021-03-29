package com.example.myfirstandroidcalculator;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class MainActivity extends AppCompatActivity {
    private final static String KeyCalc = "Calc";

    private Calc calculator;
    private TextView calcScreen;
    private String calcOperation;
    private Boolean isDot;
    private Boolean darkMode = false;

//    private static final String NameSharedPreference = "LOGIN";
//    private static final String AppTheme = "APP_THEME";
//    protected static final int AppThemeCodeStyle = 0;
//    protected static final int AppThemeDark = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setTheme(getAppTheme(R.style.AppTheme));
        setContentView(R.layout.activity_main);

        calculator = new Calc();
        initView();
    }

//    private int getAppTheme(int codeStyle) {
//        return codeStyleToStyleId(getCodeStyle(codeStyle));
//    }
//
//    protected int getCodeStyle(int codeStyle) {
//        // Работаем через специальный класс сохранения и чтения настроек
//        SharedPreferences sharedPref = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);
//        //Прочитать тему, если настройка не найдена - взять по умолчанию
//        return sharedPref.getInt(AppTheme, codeStyle);
//    }
//
//    protected void setAppTheme(int codeStyle) {
//        SharedPreferences sharedPref = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);
//        // Настройки сохраняются посредством специального класса editor.
//        SharedPreferences.Editor editor = sharedPref.edit();
//        editor.putInt(AppTheme, codeStyle);
//        editor.apply();
//    }
//
//    private int codeStyleToStyleId(int codeStyle) {
//        switch (codeStyle) {
//            case AppThemeCodeStyle:
//                return R.style.AppTheme;
//            case AppThemeDark:
//                return R.style.AppThemeDark;
//            default:
//                return R.style.AppTheme;
//        }
//    }

    private void initView() {
        calcScreen = findViewById(R.id.calc_screen);
        calcScreen.setText("0");
        initButtonOneClickListener();
        initButtonTwoClickListener();
        initButtonThreeClickListener();
        initButtonFourClickListener();
        initButtonFiveClickListener();
        initButtonSixClickListener();
        initButtonSevenClickListener();
        initButtonEightClickListener();
        initButtonNineClickListener();
        initButtonZeroClickListener();
        initButtonDotClickListener();
        initButtonDivisionClickListener();
        calcOperation = "null";
        isDot = false;
//        initDarkModeSwitch();
    }

//    private void initDarkModeSwitch() {
//        Button dark = findViewById(R.id.switchMaterial);
//        dark.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (switchMaterial.isChecked) {
//                    // сохраним настройки
//                    setAppTheme(1);
//                    // пересоздадим активити, чтобы тема применилась
//                    recreate();
//                } else {
//                    // сохраним настройки
//                    setAppTheme(0);
//                    // пересоздадим активити, чтобы тема применилась
//                    recreate();
//                }
//            }
//        });
//    }

    private void initButtonOneClickListener() {
        Button buttonOne = findViewById(R.id.button);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCalcScreen(calcScreen, calculator.getButtonOne(), calculator.getNumberFirst(), calculator.getNumberSecond(), calcOperation);

            }
        });
    }

    private void initButtonTwoClickListener() {
        Button buttonTwo = findViewById(R.id.button2);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCalcScreen(calcScreen, calculator.getButtonTwo(), calculator.getNumberFirst(), calculator.getNumberSecond(), calcOperation);
            }
        });
    }

    private void initButtonThreeClickListener() {
        Button buttonThree = findViewById(R.id.button3);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCalcScreen(calcScreen, calculator.getButtonThree(), calculator.getNumberFirst(), calculator.getNumberSecond(), calcOperation);
            }
        });
    }

    private void initButtonFourClickListener() {
        Button buttonFour = findViewById(R.id.button4);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCalcScreen(calcScreen, calculator.getButtonFour(), calculator.getNumberFirst(), calculator.getNumberSecond(), calcOperation);
            }
        });
    }

    private void initButtonFiveClickListener() {
        Button buttonFive = findViewById(R.id.button5);
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCalcScreen(calcScreen, calculator.getButtonFive(), calculator.getNumberFirst(), calculator.getNumberSecond(), calcOperation);
            }
        });
    }

    private void initButtonSixClickListener() {
        Button buttonSix = findViewById(R.id.button6);
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCalcScreen(calcScreen, calculator.getButtonSix(), calculator.getNumberFirst(), calculator.getNumberSecond(), calcOperation);
            }
        });
    }

    private void initButtonSevenClickListener() {
        Button buttonSeven = findViewById(R.id.button7);
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCalcScreen(calcScreen, calculator.getButtonSeven(), calculator.getNumberFirst(), calculator.getNumberSecond(), calcOperation);
            }
        });
    }

    private void initButtonEightClickListener() {
        Button buttonEight = findViewById(R.id.button8);
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCalcScreen(calcScreen, calculator.getButtonEight(), calculator.getNumberFirst(), calculator.getNumberSecond(), calcOperation);
            }
        });
    }

    private void initButtonNineClickListener() {
        Button buttonNine = findViewById(R.id.button9);
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCalcScreen(calcScreen, calculator.getButtonNine(), calculator.getNumberFirst(), calculator.getNumberSecond(), calcOperation);
            }
        });
    }

    private void initButtonZeroClickListener() {
        Button buttonZero = findViewById(R.id.button10);
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCalcScreen(calcScreen, calculator.getButtonZero(), calculator.getNumberFirst(), calculator.getNumberSecond(), calcOperation);
            }
        });
    }

    private void initButtonDotClickListener() {
        Button buttonDot = findViewById(R.id.button11);
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isDot) {
                    calcScreen.append(calculator.getButtonDot());
                    isDot = true;
                }
            }
        });
    }

    private void initButtonDivisionClickListener() {
        Button buttonDivision = findViewById(R.id.button12);
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calcOperation.equals("null")) {
                    calcOperation = "division";
                    calculator.setNumberFirst(calcScreen);
                    calculator.setIsNumberFirst(true);
                    isDot = false;
                } else if (!calculator.isNumberSecond()) {
                    calcOperation = "division";
                } else {
                    makeOperation("division");
                }
            }
        });
    }


    private void setCalcScreen(TextView calculatorScreen, String button, double numFirst, double numSecond, String operation) {
        if (!calculator.isNumberFirst() && !isDot && calculatorScreen.getText() == "0") {
            calculatorScreen.setText(button);
        } else if (!calculator.isNumberFirst() && !isDot && calculatorScreen.getText() != "0") {
            calculatorScreen.append(button);
        } else if (!calculator.isNumberFirst() && isDot) {
            calculatorScreen.append(button);
        } else if (calculator.isNumberFirst() && !isDot) {
            calculatorScreen.setText(button);
            calculator.setNumberFirst(calculatorScreen);
        }
    }

    private void makeOperation(String operation) {
        switch (operation) {
            case "division":
                calcScreen.setText("" + (calculator.getNumberFirst() / calculator.getNumberSecond()));
                calculator.setNumberFirst(calcScreen);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        calculator = savedInstanceState.getParcelable(KeyCalc);
        if (calculator.isNumberSecond()) {
            calcScreen.setText("" + calculator.getNumberSecond());
        } else {
            calcScreen.setText("" + calculator.getNumberFirst());
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putParcelable(KeyCalc, calculator);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}