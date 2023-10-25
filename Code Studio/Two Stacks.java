public class TwoStack {


	int arr[];

	int top1;
	int top2;




	int size;

	public TwoStack(int s) {

		this.size = s;

		top1 = -1;

		top2 = s;

		arr = new int[s];
		
	}



	public void push1(int num) {

		if(top2 - top1 > 1){

			top1++;

			arr[top1] = num;
		} 
	}

	public void push2(int num) {

		if(top2 - top1 > 1){

			top2--;

			arr[top2] = num;
		}
	}



	public int pop1() {

		if(top1 >= 0){
			int ans = arr[top1];
			top1--;

			return ans;	
		}
		else{
			return -1;
		}
	}

	public int pop2() {


		if(top2 < size){






			int ans = arr[top2];


			top2++;
			return ans;	
		}
		else{

			return -1;
		}

	}
}
