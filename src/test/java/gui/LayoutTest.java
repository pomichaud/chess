package gui;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static java.awt.Color.darkGray;
import static java.awt.Color.lightGray;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LayoutTest {

    GameFrame frame;

    @Before
    public void
    newFrame() {
        frame = new GameFrame();
    }

    @Test public void
    firstLine() {
        assertThat( colorOf( "a8" ), is( darkGray ) );
        assertThat( colorOf( "b8" ), is( lightGray ) );
        assertThat( colorOf( "c8" ), is( darkGray ) );
        assertThat( colorOf( "d8" ), is( lightGray ) );
        assertThat( colorOf( "e8" ), is( darkGray ) );
        assertThat( colorOf( "f8" ), is( lightGray ) );
        assertThat( colorOf( "g8" ), is( darkGray ) );
        assertThat( colorOf( "h8" ), is( lightGray ) );
    }

    @Test public void
    secondLine() {
        assertThat( colorOf( "a7" ), is( lightGray ) );
        assertThat( colorOf( "b7" ), is( darkGray ) );
        assertThat( colorOf( "c7" ), is( lightGray ) );
        assertThat( colorOf( "d7" ), is( darkGray ) );
        assertThat( colorOf( "e7" ), is( lightGray ) );
        assertThat( colorOf( "f7" ), is( darkGray ) );
        assertThat( colorOf( "g7" ), is( lightGray ) );
        assertThat( colorOf( "h7" ), is( darkGray ) );
    }

    private Color colorOf(String name) {
        Component found = null;
        Component[] all = frame.getContentPane().getComponents();
        for( Component component : all) {
            if (component.getName().equalsIgnoreCase(name)) {
                found = component;
                break;
            }
        }
        return found.getBackground();
    }

}
