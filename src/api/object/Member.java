package api.object;

// equals 함수 override
public class Member {

    public String id;

    public Member(String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Member) {
            Member member = (Member) obj;
            return id.equals(member.id);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode(); // 동일한 문자열일 경우 같은 해시 코드를 리턴.
    }
}
