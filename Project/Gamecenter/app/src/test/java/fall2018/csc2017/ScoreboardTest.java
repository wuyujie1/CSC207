package fall2018.csc2017;

import org.junit.Test;

import fall2018.csc2017.Scoreboard.FragmentPage;
import fall2018.csc2017.UserAndScore.User;
import fall2018.csc2017.Scoreboard.FragmentPageLocal;
import fall2018.csc2017.Scoreboard.ScoreboardController;
import fall2018.csc2017.Scoreboard.ScoreboardControllerLocal;
import fall2018.csc2017.UserAndScore.UserManager;

import static org.junit.Assert.assertEquals;

public class ScoreboardTest {

    @Test
    public void testGetPosition(){
        FragmentPage fp = new FragmentPage();
        ScoreboardController sc = new ScoreboardController(UserManager.get_instance(), fp);
        String p1 = sc.getPosition(1);
        String p2 = sc.getPosition(3);
        assertEquals(p1, "1st");
        assertEquals(p2, "3rd");
    }

    @Test
    public void testLocakGetPosition(){
        FragmentPageLocal fpl = new FragmentPageLocal();
        User u = new User("qwe@", "qweqwe");
        u.switch_game("2048");
        ScoreboardControllerLocal scl = new ScoreboardControllerLocal(u, fpl);
        String p1 = scl.getPosition(1);
        String p2 = scl.getPosition(3);
        assertEquals(p1, "1st");
        assertEquals(p2, "3rd");

    }
}
