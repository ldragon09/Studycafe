import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Object getNowDateStr;

    public static void main(String[] args) {
        System.out.println("== 프로그램 시작 ==");
        System.out.println("안녕하세요 스터디카페입니다!");
        Scanner sc = new Scanner(System.in);
        List<Member> members = new ArrayList<>();
        while (true){
            String regDate = Util.getNowDateStr();
            System.out.println("명령어) ");
            String cmd = sc.nextLine();
            if(cmd.equals("memberNew")){
                System.out.println("== 회원가입 ==");
                System.out.println("ID : ");
                String id = sc.nextLine();
                System.out.println("PW : ");
                String pw = sc.nextLine();
                System.out.println("NAME : ");
                String name = sc.nextLine();
                System.out.println(getNowDateStr);
                System.out.println("회원가입이 완료되었습니다.");


                Member member = new Member(id, pw, name);
                members.add(member);
                System.out.printf("%s회원님 환영합니다\n", name);

            }if(cmd.equals("login")){


                System.out.println("== 로그인 ==");
                System.out.println("ID : ");
                String loginId = sc.nextLine();
                System.out.println("PW: ");
                String loginPw = sc.nextLine();
                System.out.println("로그인에 성공하였습니다!");



            }if(cmd.equals("mypage")){
                Member members1 = members.get(0);
                System.out.printf("현재 로그인 되어있는 아이디는 %s입니다. %s부터 가입되어있습니다.\n", members1.id, getNowDateStr);
            }else if(cmd.equals("ruls")){
                System.out.println("규칙\n1. 소란스럽지 않게 하기\n2. 퇴실시 뒷정리 깔끔히하기\n3. 입, 퇴실 등록 잘하기");
            }else if(cmd.equals("price")){
                System.out.println("Price\n1. 24시간 = 33,000\n2. 55시간 = 70,000\n3. 100시간 = 120,000\n4. 200시간 = 220,000\n");
            }else{
                System.out.println("명령어를 입력해주세요.");
            }




            if(cmd.equals("exit")){
                break;
            }
        }
        System.out.println("== 프로그램 종료 ==");
    }

    }

class Member{
    String id;
    String pw;
    String name;
    public Member(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
    }


}
