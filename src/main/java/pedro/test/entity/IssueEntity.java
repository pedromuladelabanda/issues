package pedro.test.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/** ISSUE entity */
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "ISSUE", schema = "TEST")
@SequenceGenerator(
        name = "ISSUE_GENERATOR",
        schema = "TEST",
        sequenceName = "ISSUE_SEQ",
        allocationSize = 1)
@NoArgsConstructor
@AllArgsConstructor
public class IssueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ISSUE_GENERATOR")
    @Column(name = "ID")
    private Long id;

    @Column(name = "ISSUE")
    private String issue;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "LABEL")
    private Integer label;
}

