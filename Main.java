public class Main {
    public static void main(String[] args) {
        AbilityScores qirenAbilityScores = new AbilityScores(8, 14, 15, 10, 12, 20);
        STProfs qirenSTProfs = new STProfs(false, true, false, false, false, true);
        Skills qirenSkillProfs = new Skills(false, false, true, false, true, false, true, true, true, false, false, true, false, true, false, true, true, false);
        Char qiren = new Char(qirenAbilityScores, qirenSTProfs, qirenSkillProfs);
        Dice d2 = new Dice(2);
        Dice d6 = new Dice(6);
        Dice d20 = new Dice(20);
        System.out.println("hi");
    }
}