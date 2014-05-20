//Jim Yuan
//APCS2 pd8
//HW41
//2014-05-19

public class HeapSort{



    public static Integer[] sort(Integer[] data){	
	ALHeap nums = new ALHeap();
	for(Integer i : data){
	    nums.add(i);	    
	}

	for(int i = 0; i < data.length; i++){
	    data[i] = nums.removeMin();
	}
	return data;

    }

    //O(n)mem

    public static void main(String[] args){
	
	Integer[] dat = new Integer[10000];


	for (int i = 0; i < 10000; i++){
	    dat[i] = (int)(Math.random()*10000);
	}
	for(Integer i: dat){
	    System.out.print("[" + i + "]");
	}

	System.out.println("\nSorting...");
	dat = sort(dat);
	for(Integer i: dat){
	    System.out.print("[" + i + "]");
	}
	

    }




}
