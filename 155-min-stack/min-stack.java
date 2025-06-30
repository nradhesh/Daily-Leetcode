import java.util.ArrayList;
import java.util.List;

class Pair {
    int val;
    int min;

    public Pair(int val, int min) {
        this.val = val;
        this.min = min;
    }
}

class MinStack {
    private List<Pair> st;

    public MinStack() {
        st = new ArrayList<>();
    }

    public void push(int val) {
        int minVal = st.isEmpty() ? val : Math.min(val, st.get(st.size() - 1).min);
        st.add(new Pair(val, minVal));
    }

    public void pop() {
        if (!st.isEmpty()) {
            st.remove(st.size() - 1);
        }
    }

    public int top() {
        return st.isEmpty() ? -1 : st.get(st.size() - 1).val;
    }

    public int getMin() {
        return st.isEmpty() ? -1 : st.get(st.size() - 1).min;
    }
}
