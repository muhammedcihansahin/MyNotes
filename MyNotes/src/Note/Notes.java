package Note; 

import static Note.NotePiece.NPH;
import static Note.NotePiece.NPW;

public class Notes {

    NotePiece head;
    NotePiece tail;
    NotePiece bosNot;

    public Notes() {

        bosNot = new NotePiece();

        head = tail = bosNot;
        bosNot.setBounds(0, 0, NPW, NPH);

    }

}
