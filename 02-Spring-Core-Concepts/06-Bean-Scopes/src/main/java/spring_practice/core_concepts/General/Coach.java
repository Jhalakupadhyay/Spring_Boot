package spring_practice.core_concepts.General;

import org.springframework.context.annotation.Lazy;

@Lazy
public interface Coach
{
    String getDailyWorkOut();
}
