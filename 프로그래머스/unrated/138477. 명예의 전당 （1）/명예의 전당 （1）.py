def solution(k, score):
    answer = []
    final_answer = []
    for i in score:
        answer.append(i)      
        answer.sort(reverse = 1)
        if len(answer) > k:
            del answer[k]
        final_answer.append(answer[-1])
                    
    return final_answer