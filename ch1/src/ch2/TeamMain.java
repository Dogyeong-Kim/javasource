package ch2;

public class TeamMain {
    public static void main(String[] args) {
        Team team1 = new Team(1L, "team1");

        TeamMember member1 = new TeamMember(1L, "홍길동");
        TeamMember member2 = new TeamMember(2L, "성춘향");

        member1.setTeam(team1);
        member2.setTeam(team1);
        // TeamMember [id=1, userName=홍길동, team=Team [id=1, teamName=team1]]
        System.out.println(member1);
        // 객체 그래프 탐색 (member 입장에서 팀 정보 가져오기)
        System.out.println(member1.getTeam().getTeamName());

        // 팀 => 멤버 정보 조회
        team1.getList().add(member1);
        team1.getList().add(member2);
        System.out.println(team1.getList());
    }
}
