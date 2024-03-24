package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현
    public static LottoTicket generateTicket() {
        List<Integer> ticketNumbers = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            ticketNumbers.add(i);
        }
        Collections.shuffle(ticketNumbers);
        ticketNumbers = ticketNumbers.subList(0, 6);
        Collections.sort(ticketNumbers);
        return new LottoTicket(ticketNumbers);
    }

    public static void main(String[] args) {
        LottoTicket ticket = Lotto.generateTicket();
        List<Integer> numbers = ticket.getNumbers();
        System.out.println("로또 번호: " + numbers);
    }
}
