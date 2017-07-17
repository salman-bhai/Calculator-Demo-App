package com.example.salman.calculatordemoapp;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.apache.tools.ant.Main;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowTextView;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainActivityUnitTest {
    private MainActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.buildActivity(MainActivity.class)
                .create()
                .resume()
                .get();
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(activity);
    }

    @Test
    public void checkAddition() throws Exception {
        EditText inp1 = (EditText) activity.findViewById(R.id.input1);
        inp1.setText("4");
        EditText inp2 = (EditText) activity.findViewById(R.id.input2);
        inp2.setText("8");
        Button add = (Button) activity.findViewById(R.id.add);

        assertNotNull(inp1);
        assertNotNull(inp2);
        assertNotNull(add);

        add.performClick();

        TextView result = (TextView) activity.findViewById(R.id.result);
        assertNotNull(result);
        assertEquals(View.VISIBLE, result.getVisibility());
        assertEquals("12.0", result.getText());

    }

    @Test
    public void checkSubtraction() throws Exception {
        EditText inp1 = (EditText) activity.findViewById(R.id.input1);
        inp1.setText("4");
        EditText inp2 = (EditText) activity.findViewById(R.id.input2);
        inp2.setText("8");
        Button sub = (Button) activity.findViewById(R.id.sub);

        assertNotNull(inp1);
        assertNotNull(inp2);
        assertNotNull(sub);

        sub.performClick();

        TextView result = (TextView) activity.findViewById(R.id.result);
        assertNotNull(result);
        assertEquals(View.VISIBLE, result.getVisibility());
        assertEquals("-4.0", result.getText());
    }

    @Test
    public void checkMultiplication() throws Exception {
        EditText inp1 = (EditText) activity.findViewById(R.id.input1);
        inp1.setText("4");
        EditText inp2 = (EditText) activity.findViewById(R.id.input2);
        inp2.setText("8");
        Button mul = (Button) activity.findViewById(R.id.mult);

        assertNotNull(inp1);
        assertNotNull(inp2);
        assertNotNull(mul);

        mul.performClick();

        TextView result = (TextView) activity.findViewById(R.id.result);
        assertNotNull(result);
        assertEquals(View.VISIBLE, result.getVisibility());
        assertEquals("32.0", result.getText());
    }

    @Test
    public void checkDivision() throws Exception {
        EditText inp1 = (EditText) activity.findViewById(R.id.input1);
        inp1.setText("4");
        EditText inp2 = (EditText) activity.findViewById(R.id.input2);
        inp2.setText("8");
        Button div = (Button) activity.findViewById(R.id.div);

        assertNotNull(inp1);
        assertNotNull(inp2);
        assertNotNull(div);

        div.performClick();

        TextView result = (TextView) activity.findViewById(R.id.result);
        assertNotNull(result);
        assertEquals(View.VISIBLE, result.getVisibility());
        assertEquals("0.5", result.getText());
    }

}