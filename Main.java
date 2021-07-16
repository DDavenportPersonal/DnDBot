public class Main {
    public static void main(String[] args) {
        int[] AbilityScores = new int[]{8, 14, 15, 10, 12, 20};
        boolean[] STprofs = new boolean[]{false, true, false, false, false, true};
        boolean[] SkillProfs = new boolean[]{false, false, true, false, true, false, true, true, true, false, false, true, false, true, false, true, true, false};
        Char qiren = new Char(AbilityScores, STprofs, SkillProfs);
        System.out.println("hi");
    }
}