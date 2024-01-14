package 열거타입;


public class Issue3 {
	public static void main(String[] args) {
		//배열을 이용하여 LoginResult의 value 갑을 모두 가져옴
		LoginResult[] results = LoginResult.values();
		System.out.print("ISSUE 3. CRM의 주요 기능");
		System.out.println();
		System.out.println();
		
		//반복문을 돌려 result와 동일하면 값을 출력
		for(LoginResult result : results){
			if(result == LoginResult.리드너처링) {System.out.println(result + " - 리드 관리 소프트웨어의 기능으로, 영업 담당자가 영업 깔때기의 모든 단계에서 긍정적인 고객 관계를 쌓고 성장시킬 수 있다.");
			} else if(result == LoginResult.애널리틱스) {System.out.println(result + " - 분석 기능을 통해 고객이 무엇에 관심이 있는지, 고객에게 어떻게 연락해야 하는지, 언제 개인화된 조치가 필요한지 파악할 수 있다.");
			} else if(result == LoginResult.판매예측) {System.out.println(result + " - 상담원은 과거 판매 데이터를 조회하고, 중요한 추세를 파악하며, 업계 표준을 비교해 더 나은 예측을 할 수 있다.");
			} else if(result == LoginResult.실적메트릭) {System.out.println(result + " - 영업 추적 기능을 통한 실적 지표를 통해 목표 달성이 제대로 이루어지고 있는지, 파이프라인의 조정이 필요한지 여부를 알 수 있다.");
			}
		}
	}
}

//열거 선언
enum LoginResult {
	리드너처링,
	애널리틱스,
	판매예측,
	실적메트릭,
}
