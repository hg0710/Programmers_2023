// import java.util.*;
// class Solution {
//     public int[] solution(String[] id_list, String[] report, int k) {
        
//         Set<String> set =new HashSet<String>();
//         Map<String, Set<String>> reporting = new HashMap<String, Set<String>>();
//         Map<String,Integer> reported = new HashMap<String,Integer>();
        
//         for(String str : report){
//             set.add(str);
//         }
        
//         for (String id : id_list) {
//             Set<String> reportedSet = new HashSet<String>();
//             for (String s : set) {
//                 String[] names = s.split(" ");
//                 if (names[0].equals(id)) {
//                     reportedSet.add(names[1]);
//                 }
//             }
//             reporting.put(id, reportedSet);
//         }
        
//         for (String s : set) {
//             String[] names = s.split(" ");
//             String reporterName = names[0];
//             String reportedName = names[1];
//             reported.put(reportedName, reported.getOrDefault(reportedName, 0) + 1);
//         }
        
//         int[] answer = new int[reporting.size()];
        
//         for (int i = 0; i < id_list.length; i++) {
//             String reportingName = id_list[i];
//             Set<String> reportedNames = reporting.get(reportingName);
//             for (String s : reportedNames) {
//                 if (reported.get(s) >= k) {
//                     answer[i]++;
//                 }
//             }
//         }
//         return answer;
//     }
// }
// //시간초과
import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> reporting = new HashMap<>();
        Map<String, Integer> reportedCounts = new HashMap<>();
        Set<String> reportSet =new HashSet<String>();
        
        for(String str : report){
            reportSet.add(str);
        }
        
        for (String r : reportSet) {
            String[] parts = r.split(" ");
            String reporter = parts[0];
            String reported = parts[1];

            if (!reporting.containsKey(reporter)) {
                reporting.put(reporter, new HashSet<>());
            }
            reporting.get(reporter).add(reported);

            reportedCounts.put(reported, reportedCounts.getOrDefault(reported, 0) + 1);
        }

        int[] result = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String userId = id_list[i];
            if (reporting.containsKey(userId)) {
                Set<String> reporters = reporting.get(userId);
                for (String reporter : reporters) {
                    if (reportedCounts.get(reporter) >= k) {
                        result[i]++;
                    }
                }
            }
        }

        return result;
    }
}

