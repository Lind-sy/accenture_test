package netgloo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "testOuestionsAnswers")
public class TestQuestionAnswers{
	  
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  
	  @ManyToOne
	  @JoinColumn(name = "questionID")
	  private TestOuestions testsQuestions;
	  
	  @NotNull
	  private String answer;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TestOuestions getTestsQuestions() {
		return testsQuestions;
	}

	public void setTestsQuestions(TestOuestions testsQuestions) {
		this.testsQuestions = testsQuestions;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	  
	  
	  
	
}