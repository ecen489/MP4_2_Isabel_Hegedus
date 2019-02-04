package com.example.mp1_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String ans;
    public double operand1;
    public double operand2;
    public boolean dot;
    public boolean opSel;
    public int operation;//zero=multiply,1=add,2=subtract
    public boolean justAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ans="";
        dot=false;
        opSel=false;
        justAns=false;
    }

    public void pressOne(View v){
      if(justAns){
          ans="";
          justAns=false;
      }
        ans+="1";
      updateTextView();
    }

    public void pressTwo(View v){
        if(justAns){
            ans="";
            justAns=false;
        }
        ans+="2";
        updateTextView();
    }

    public void pressThree(View v){
        if(justAns){
            ans="";
            justAns=false;
        }
        ans+="3";
        updateTextView();
    }

    public void pressFour(View v){
        if(justAns){
            ans="";
            justAns=false;
        }
        ans+="4";
        updateTextView();
    }

    public void pressFive(View v){
        if(justAns){
            ans="";
            justAns=false;
        }
        ans+="5";
        updateTextView();
    }
    public void pressSix(View v){
        if(justAns){
            ans="";
            justAns=false;
        }
        ans+="6";
        updateTextView();
    }

    public void pressSeven(View v){
        if(justAns){
            ans="";
            justAns=false;
        }
        ans+="7";
        updateTextView();
    }

    public void pressEight(View v){
        if(justAns){
            ans="";
            justAns=false;
        }
        ans+="8";
        updateTextView();
    }

    public void pressNine(View v){
        if(justAns){
            ans="";
            justAns=false;
        }
        ans+="9";
        updateTextView();
    }

    public void pressZero(View v){
        if(justAns){
            ans="";
            justAns=false;
        }
        ans+="0";
        updateTextView();
    }

    public void pressDot(View v){
        if(justAns){
            ans="";
            justAns=false;
        }
        if(!dot) {
            ans += ".";
            updateTextView();
            dot=true;
        }
    }



    public void pressMultiply(View v){
       if(!ans.equals("")) {
           operation = 0;
           operand1 = Double.parseDouble(ans);
           ans = "";
           dot = false;
           updateTextView();
           opSel = true;
       }
    }

    public void pressAdd(View v){
        if(!ans.equals("")) {
            operation = 1;
            operand1 = Double.parseDouble(ans);
            ans = "";
            dot = false;
            updateTextView();
            opSel = true;
        }
    }
    public void pressSub(View v){
        if(!ans.equals("")) {
            operation = 2;
            operand1 = Double.parseDouble(ans);
            ans = "";
            dot = false;
            updateTextView();
            opSel = true;
        }
    }

    public void pressEnter(View v){
        if(opSel && !ans.equals("")) {
            operand2=Double.parseDouble(ans);
            double newAns=0;
            if(operation==0) {
                newAns=operand1*operand2;
            }
            else if(operation==1){
                newAns=operand1+operand2;
            }
            else if(operation==2){
                newAns=operand1-operand2;
            }

            ans=Double.toString(newAns);
            updateTextView();
            dot=false;
            opSel=false;
            operand1=0;
            operand2=0;
            justAns=true;
        }
    }
    public void pressClear(View v){
        ans="";
        dot=false;
        opSel=false;
        operand1=0;
        operand2=0;
        updateTextView();
    }


    public void updateTextView(){
        TextView disp = findViewById(R.id.numDisplay);
        disp.setText(ans);
    }
}
