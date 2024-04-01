class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++) {
            String[] people = photo[i];
            for(int j = 0; j < people.length; j++) {
                int idx = find(people[j], name);
                int yearningPoint = idx != -1 ? yearning[idx] : 0;
                answer[i] += yearningPoint;
            }
        }
        return answer;
    }
    private int find(String person, String[] name) {
        for(int i = 0; i < name.length; i++) {
            if(name[i].equals(person)) 
                return i;
        }
        return -1;
    }
}